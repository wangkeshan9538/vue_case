import Vue from 'vue'
import Router from 'vue-router'
import main from '@/components/main'
import {router_meta} from '@/router/config'

Vue.use(Router)


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
