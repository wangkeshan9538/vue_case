<template>
  <div id="head_section">
  <el-row>
    <el-col id="logo" :span="4">
      <img src="@/assets/logo.png">
    </el-col>
    <el-col id="userInfo" :span="3" offset="17">
      <div>
      用户信息
      </div>
    </el-col>
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
  // background-color: aqua;
 }
 .el-row{
   height: 100%;
 }
 .el-row .el-col{
   height: 100%;
 }
  #logo{
    background: #3F3E44;
    text-align: center;
  }

  #logo img{
    height: 60px;
    width: 60px;
  }

  #userInfo  div{
    text-align: center;
    line-height: 60px;
  }

</style>
