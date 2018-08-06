<template>
  <div>

    <Table :columnsParam="Columns" :urlParam="url"></Table>

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
        url:UserGetter,
      }
    },
    created() {
      console.log('createTaleUse');
    }
  }


</script>

<style scoped>

</style>
