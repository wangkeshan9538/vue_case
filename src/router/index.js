import Vue from 'vue'
import Router from 'vue-router'
import main from '@/components/main'
import DataManage from '@/components/dataManage/DataManage'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'main',
      component: main,
      children:[
      	{
      		path:'/data',
      		name:'data',
      		component:DataManage
      	}
      ]
    },
    
  ]
})
