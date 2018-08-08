<template>
  <div class="schedul_table_wrap">
    <Table :columnsParam="Columns" :dataQueryFunc="scheduleGetter"  ></Table>
  </div>
</template>

<script>

  import Table from '@/components/common/Table'
  import Columns from './Columns'
  import {scheduleGetter} from '@/dataQuery/scheduleQuery'

  export default {
    name: "schedule",
    components: {
      Table
    },
    data(){
      return {
        Columns,
        params:{},
        scheduleGetter
      }
    }
  }
</script>

<style scoped>
  .schedul_table_wrap{
    height: 90%;
  }
</style>
