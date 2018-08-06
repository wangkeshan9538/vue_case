'use strict'
const merge = require('webpack-merge')
const prodEnv = require('./prod.env')

module.exports = merge(prodEnv, {
  NODE_ENV: '"development"',
  ROOT_URL:'"http://rap2api.taobao.org/app/mock/data/interfaceId?scope=response"'  //这块真的奇怪 单引号内加双引号
})
