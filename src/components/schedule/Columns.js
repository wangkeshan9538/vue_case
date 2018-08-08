export default [
  {
    label: "任务序号",
    prop: "schedule_id"
  },
  {
    label: "定时规则",
    prop: "cron"
  },
  {
    label: "开启状态",
    prop: "flag"
  },
  {
    label: "描述",
    prop: "description"
  },
  {
    isTemplate:true,
    label: "操作",
    prop: "operation",
    template:{
      template:`
        <div >
        <el-button
          size="mini"
           >编辑</el-button>
        <el-button
          size="mini"
          v-if="item.row.flag === '开启'"
          >关闭</el-button>
        <el-button
          size="mini"
          v-if="item.row.flag === '关闭'"
          >开启</el-button>
        </div>  
        `,
      props:{
        item:Object,
      },
      created(){
        //console.log(this)
      }
    }
  }
]
