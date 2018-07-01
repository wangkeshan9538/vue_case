<template>
    <el-container id="main_section">

      <el-header height="6%">
        <head-section></head-section>
      </el-header>

      <el-container>
        <el-aside width="200px">Aside</el-aside>
        <el-main>Main</el-main>
      </el-container>

    </el-container>
</template>

<script>
  import HeadSection from "./headSection";

  export default {
    components: {HeadSection},
    name: 'mainSection',
    /*data () {
      return {

      }
    },*/
  }
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  #main_section{
    height: 100%;
    width: 100%;
  }
  .el-container{

  }
  .el-header{
    padding:0px;
    min-height:60px;
  }
</style>
