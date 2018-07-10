<template>
	<el-container id="main_section">

		<el-header height="6%">
			<head-section></head-section>
		</el-header>

		<el-container>
			<el-aside width="16.6666%"> <!-- 如果想要logo和侧边栏宽度一样 ，有没有更好的办法-->
				<side-menu></side-menu>
			</el-aside>
				<el-main>
					<router-view/>
				</el-main>
			</el-row>
		</el-container>

	</el-container>
</template>

<script>
  import HeadSection from "./headSection";
  import SideMenu from './SideMenu';

  export default {
    components: {HeadSection ,SideMenu},
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
  .el-aside{
  	background-color: #3F3E44;
  }
</style>
