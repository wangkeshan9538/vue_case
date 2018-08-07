<template>
  <div class="upTable">

    <Table :columnsParam="Columns" :dataQueryFunc="urlFunc"></Table>

  </div>
</template>

<script>
  import Table from '../common/Table'
  import Columns from '../common/Columns.js'
  import {UserGetter} from '../../dataQuery/TableUserQuery'

  export default {
    name: "table-use",
    components: {
      Table
    },
    data() {
      return {
        Columns,
        urlFunc:UserGetter,
      }
    },
    created() {
      console.log('createTaleUse');
    }
  }


</script>

<style scoped>

  .upTable{
    height: 90%;
  }
</style>
