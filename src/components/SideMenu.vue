<template>
		<el-menu
			background-color="#3F3E44"
			text-color="#A4A4A4"
			active-text-color="#1EDDAA"
			default-active="2"
			class="el-menu-vertical-demo"
			>
			<el-submenu index="1">
				<template slot="title">
					<span>主数据管理</span>
				</template>
					<el-menu-item index="1-1">选项1</el-menu-item>
					<el-menu-item index="1-2">选项2</el-menu-item>
					<el-menu-item index="1-3">选项3</el-menu-item>
					<el-menu-item index="1-4">选项1</el-menu-item>
				</el-submenu>
			</el-submenu>
			<el-submenu index="2">
				<template slot="title">
					<span>主数据管理</span>
				</template>
					<el-menu-item index="2-1">选项1</el-menu-item>
					<el-menu-item index="2-2">选项2</el-menu-item>
					<el-menu-item index="2-3">选项3</el-menu-item>
					<el-menu-item index="2-4">选项1</el-menu-item>
				</el-submenu>
			</el-submenu>
      <el-submenu index="2">
        <template slot="title">
          <span>主数据管理</span>
        </template>
        <el-menu-item index="2-1">选项1</el-menu-item>
        <el-menu-item index="2-2">选项2</el-menu-item>
        <el-menu-item index="2-3">选项3</el-menu-item>
        <el-menu-item index="2-4">选项1</el-menu-item>
      </el-submenu>
      </el-submenu>
      <el-submenu index="2">
        <template slot="title">
          <span>主数据管理</span>
        </template>
        <el-menu-item index="2-1">选项1</el-menu-item>
        <el-menu-item index="2-2">选项2</el-menu-item>
        <el-menu-item index="2-3">选项3</el-menu-item>
        <el-menu-item index="2-4">选项1</el-menu-item>
      </el-submenu>
      </el-submenu>
      <el-submenu index="2">
        <template slot="title">
          <span>主数据管理</span>
        </template>
        <el-menu-item index="2-1">选项1</el-menu-item>
        <el-menu-item index="2-2">选项2</el-menu-item>
        <el-menu-item index="2-3">选项3</el-menu-item>
        <el-menu-item index="2-4">选项1</el-menu-item>
      </el-submenu>
      </el-submenu>
		</el-menu>
 </template>

<script>
	export default {
		name:"side-menu"
	}
</script>

<style>
	.el-menu{
		border: none;
	}
  *::-webkit-scrollbar {/*滚动条整体样式*/
    width: 5px;     /*高宽分别对应横竖滚动条的尺寸*/
    height: 1px;
  }
  *::-webkit-scrollbar-thumb {/*滚动条里面小方块*/
    border-radius: 10px;
    -webkit-box-shadow: inset 0 0 5px rgba(0,0,0,0.2);
    background: #1EDDAA;
  }
  *::-webkit-scrollbar-track {/*滚动条里面轨道*/
    -webkit-box-shadow: inset 0 0 5px rgba(0,0,0,0.2);
    border-radius: 10px;
    background: #EDEDED;
  }

</style>
