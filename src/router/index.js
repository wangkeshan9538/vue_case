import Vue from 'vue'
import Router from 'vue-router'
import main from '@/components/main'
import {router_meta} from '@/router/config'

Vue.use(Router)


console.log(router_meta)
export default new Router({
  routes: [
    {
      path: '/',
      name: 'main',
      component: main,
      children:router_meta
    },
  ]
})
