<template>
  <div class="table_wrap">
    <el-table
      :data="datas"
      style="width: 100%"
      highlight-current-row
      stripe
      height="90%"
    >

      <el-table-column
        v-for="(column,index) in columns"
        :prop="column.prop"
        :label="column.label"
        :key="index"
        align="center"
      >
      </el-table-column>

    </el-table>

    <div class="page_wrap">
      <el-pagination
        ref="pageRef"
        background
        :page-sizes="[10, 20, 30, 40]"
        :page-size="page.pageSize"
        layout="total, sizes, prev, pager, next, jumper"
        :total="page.sum"
        @current-change="PageChange"
      ></el-pagination>
    </div>

  </div>
</template>

<script>


  export default {
    props: {//是单向数据流 ，存的是一个数据对象的指针 ，所以父级改动会同步到子组件，而子组件的改动不会同步到父级，所以如果希望不变 ，需要赋给data,
      dataQueryFunc: Function,
      columnsParam: Array,
      params:Object
    },
    data() {
      return {
        datas: [],//datas,
        queryFunc: this.dataQueryFunc,
        page: {},
        columns: this.columnsParam
      }
    },
    created() {
      console.log('created');
      this.refreshTable();
    },
    methods: {
      PageChange() {
        console.log('pageChange');
      },

      refreshTable() {
        let self = this;
        console.log('刷新')
        this.queryFunc(params).then(function (res) {
          self.datas = res.data.data;
          self.page = res.data.page;
        });
      }

    }
  }
</script>

<style>

  .table_wrap {
    height: 100%;
    width: 100%;
  }

  .page_wrap {
    text-align: right;
    margin-top: 5px;
  }

  .el-table {
    font-size: 12px;
    border-radius: 6px;
  }

  .el-table thead .cell {
    color: #444444;
    text-align: center;
  }

  .el-table thead th {
    padding-top: 5px;
    padding-bottom: 5px;
  }

  .el-table tbody td {
    padding-top: 5px;
    padding-bottom: 5px;
    border: none;
  }

  .el-table .el-table__body tr.current-row > td {
    background: #e3e6e9 !important;
  }
</style>
