<template>


    <Table :columnsParam="Columns" :urlParam="url"></Table>


</template>

<script>
  import Table from './Table'
  import Columns from './Columns.js'

  export default {
    name: "table-use",
    components: {
      Table
    },
    data() {
      return {
        Columns,
        url:urlfuc,
      }
    },
    created() {
      console.log('createTaleUse');
    }
  }


  function urlfuc(){
    let res='这是response';
    return{
      then(func){
        func(res);
      }
    }
  }
</script>

<style scoped>

</style>
