<template>
  <button
    class="ele-button"
    @click="handerClick"
    :class="['ele-button--' + type, size ? 'ele-button--' + size : '']"
  >
    <slot></slot>
  </button>
</template>
<script>
// size	尺寸	string	medium / small / mini	—
// type	类型	string	primary / success / warning / danger / info / text	—
// plain	是否朴素按钮	boolean	—	false
// round	是否圆角按钮	boolean	—	false
// circle	是否圆形按钮	boolean	—	false
// loading	是否加载中状态	boolean	—	false
// disabled	是否禁用状态	boolean	—	false
// icon	图标类名	string	—	—
// autofocus	是否默认聚焦	boolean	—	false
// native-type	原生 type 属性	string	button / submit / reset	button

export default {
  name: "EleButton",
  props: {
    size: {
      type: String,
      default: () => "",
    },
    type: {
      type: String,
      default: () => "default",
    },
  },
  data() {
    return {};
  },
  methods: {
    handerClick(evt) {
      this.$emit("click", evt);
    },
  },
};
</script>
<style lang="scss">
@import "../../theme/button.scss";
</style>