<template>
		<el-menu
			background-color="#3F3E44"
			text-color="#A4A4A4"
			active-text-color="#1EDDAA"
			default-active="2"
			class="el-menu-vertical-demo"
			router
			>
			<el-submenu index="1">
				<template slot="title">
					<span>主数据管理</span>
				</template>
					<el-menu-item :index="router_info.DataManage.name">选项1</el-menu-item> <!--为了达到路由的效果 ，这里放 name 和path都可以  -->
					<el-menu-item :index="router_info.Table.name">选项2</el-menu-item>
					<el-menu-item index="1-3">选项3</el-menu-item>
					<el-menu-item index="1-4">选项1</el-menu-item>
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
	</el-menu>
 </template>

<script>
	import {router_info} from '@/router/config.js'
	export default {
		name: "side-menu",
		data() {
			return {
				router_info
			}
		}
	}
</script>

<style>

</style>
