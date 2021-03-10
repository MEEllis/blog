<template>
  <div class="">
    <div class="">
      <p>size:default,medium / small / mini</p>
      <ele-button @click="aa">我是</ele-button>
      <ele-button size="medium">我是</ele-button>
      <ele-button size="small">我是</ele-button>
      <ele-button size="mini">我是</ele-button>
    </div>
    <div class="">
      <p>type: primary / success / warning / danger / info / text</p>
      <ele-button>我是</ele-button>
      <ele-button type="primary">我是</ele-button>
      <ele-button type="success">我是</ele-button>
      <ele-button type="warning">我是</ele-button>
      <ele-button type="danger">我是</ele-button>
      <ele-button type="info">我是</ele-button>
      <ele-button type="text">我是</ele-button>
    </div>
  </div>
</template>
<script>
export default {
  data() {
    return {};
  },
  methods:{
    aa(evt){
      console.log(evt);
    }
  }
};
</script>