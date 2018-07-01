<template>
  <div id="head_section">
  <el-row>
    <el-col id="logo" :span="2">1</el-col>
    <el-col :span="22">1</el-col>
  </el-row>
  </div>
</template>

<script>
    export default {
        name: "head-section"
    }
</script>


<style scoped>
 #head_section{
   height: 100%;
   width: 100%;
   background-color: aqua;
 }
 .el-row{
   height: 100%;
 }
  #logo{
    background: antiquewhite;
    height: 100%;
  }
</style>
