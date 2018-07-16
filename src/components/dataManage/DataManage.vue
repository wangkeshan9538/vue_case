<template>
	<div>
	<header class="table_header">
		<p class="table_title">主数据管理</p>
		
		<div class="menu_line">
		
		<div class="menu_item">
			<label>日期</label>
			<el-input
			v-model="searchParam.uploadTime"
			size="small"
			placeholder="请输入"
			></el-input>
		</div>
		
		<div class="menu_item">
			<label>版本号</label>
			<el-input
			v-model="searchParam.versionId"
			size="small"
			placeholder="请输入"
			></el-input>
		</div>
		
		<div class="menu_item">
			<label>上传人员</label>
			<el-input
			v-model="searchParam.operaPerson"
			size="small"
			placeholder="请输入"
			></el-input>
		</div>
		
		<div class="operation_btm">
		 <el-button type="primary" 
		 plain
		 size="small"
		 icon="el-icon-search"
		 >查询</el-button>
		 
		 <el-button 
		 plain
		 size="small"
		 >删除</el-button>
		 
		 <el-button 
		 plain
		 size="small"
		 >上传</el-button>
		 
		</div>
		
		</div>
		
	</header>
	
	<section class="upTable">
		<el-table
	      :data="tableData"
	      style="width: 100%"
	      highlight-current-row="true"
	      stripe
	      >
	      <el-table-column
	        prop="date"
	        label="日期"
	        align="center"
	        >
	      </el-table-column>
	      <el-table-column
	        prop="name"
	        label="姓名"
	        align="center"
	        >
	      </el-table-column>
	      <el-table-column
	        prop="address"
	        label="地址"
	        align="center"
	        >
	      </el-table-column>
	      <el-table-column
	        prop="address"
	        label="地址"
	        align="center"
	        >
	      </el-table-column>
	    </el-table>
	    
	    <div class="page_wrap">
	     <el-pagination
	      background
	      :current-page="currentPage4"
	      :page-sizes="[100, 200, 300, 400]"
	      :page-size="100"
	      layout="total, sizes, prev, pager, next, jumper"
	      :total="400"></el-pagination>
	    </div>  
    

	</section>
	
	</div>
</template>

<script>
	import tableData from './TableData'
	export default {
		name: 'data-manage',
		data(){return {
			searchParam:{
				uploadTime:"",
				versionId:"",
				operaPerson:""
			},
			tableData
		}}
	}
</script>

<style>
.table_title{
      color: #444444;
      line-height: 16px;
      margin: 20px 6px;
}

.menu_line{
	display: flex;
}
.menu_line label{
 	font-size:12px ;	
	width: 25.5%;
	text-align: right;
}
.menu_item{
	width: 23%;
	display: flex;
	justify-content:space-between;
	align-items:center;
}
.el-input{
	width: 67%;
}

.operation_btm{
	margin-left:20px ;
	width: 25%;
	display: flex;
	align-items:center;
	justify-content:space-around;
}
.operation_btm .el-button{
	width: 80px;
	border-radius:6px;
}

.upTable{
	margin-top: 10px;
}
.el-table{
	font-size: 12px;
	border-radius: 6px;
}
.el-table thead .cell{
	color:#444444;
	text-align: center;
}
.el-table thead th{
	padding-top:  5px ;
	padding-bottom:  5px ;
}
.el-table tbody td{
	padding-top:  5px ;
	padding-bottom:  5px ;
	border: none;
}
.el-table .el-table__body tr.current-row>td {
    background: #e3e6e9 !important;
}
    
.page_wrap{
	text-align: right;
	margin-top: 5px;
}
</style>