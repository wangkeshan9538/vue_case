import DataManage from '@/components/dataManage/DataManage'
import TableData from '@/components/dataManage/TableUse'
import Schedule from '@/components/schedule/Schedule'


export const router_info = { //为了方便外界通过键值的方式 使用路由信息，
  'DataManage': {
    path: '/data',
    name: 'data',
    component: DataManage
  },
  'Table': {
    path: 'table',
    name: 'table',
    component: TableData
  },
  'Schedule': {
    path:'schedule',
    name:'schedule',
    component:Schedule
  }
}


function convert2Array(object) { //转换成Array , 有没有更好的写法
  let array = [...object];
  for (let i in object) {
    array.push(object[i])
  }
  return array;
}

export const router_meta = convert2Array(router_info)
