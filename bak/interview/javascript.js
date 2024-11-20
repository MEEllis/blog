//s的基本数据类型
console.log("Null,undefind,boolean,Number,String");

function add(a, b) {
  console.log(a + b);
}
function sub(a, b) {
  console.log(a - b);
}
add.call(sub, 2, 1);
add.apply(sub, [2, 1]);
