const path = require("path");
const webpack = require("webpack");

// 引入clean-webpack-plugin插件
const { CleanWebpackPlugin } = require("clean-webpack-plugin");
const HtmlWebpackPlugin = require("html-webpack-plugin");
const VueLoaderPlugin = require("vue-loader/lib/plugin");

console.log("webpack is out of the box. launching webpack .........");

module.exports = {
  mode: "development", // "production" | "development" | "none"
  context: process.cwd(),
  entry: resolve("../examples/entry.js"), //默认配置 :"./src/index.js"
  output: {
    path: resolve("../dist"), //默认配置:"../dist"
    publicPath: ".",
    filename: "[name][chunkhash:8].js", //默认配置 :"main.js"
  },
  target: "web",
  devServer: {
    historyApiFallback: true,
    contentBase: resolve("../examples"),
    publicPath: "/", //
    host: "localhost",
    port: "10000",
    // 启动gzip压缩，提升速度
    compress: true,
    hot: true,
    open: false,
    inline: true,
  },
  devtool: "source-map",
  module: {
    rules: [
      {
        test: /\.vue$/,
        loader: "vue-loader",
        options: {
          compilerOptions: {
            preserveWhitespace: false,
          },
        },
      },
      { test: /\.scss$/, use: ["style-loader", "css-loader", "sass-loader"] },
      {
        test: /\.js$/,
        exclude: /node_modules/,
        //一定要指定loader执行的先后顺序，先执行eslint再执行babel
        loader: "eslint-loader",
        options: {
          fix: true,
        },
      },

      {
        test: /\.js$/,
        exclude: /node_modules/,
        loader: "babel-loader",
        options: {
          presets: [
            [
              "@babel/preset-env",
              {
                useBuiltIns: "usage",
                corejs: { version: 3 },
              },
            ],
          ],
        },
      },
    ],
  },
  plugins: [
    new CleanWebpackPlugin(),
    // new webpack.NamedModulesPlugin(),
    new webpack.HotModuleReplacementPlugin(),
    new HtmlWebpackPlugin({
      template: resolve("../examples/index.html"),
      filename: "index.html",
    }),
    new VueLoaderPlugin(),
  ],
};

function resolve(dir) {
  return path.join(__dirname, dir);
}
