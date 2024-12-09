import ElButton from "../packages/button";
const components = [ElButton];

const install = (Vue, opts = {}) => {
  components.forEach((Component) => {
    Vue.component(Component.name, Component);
  });
};

export default {
  install,
};

