import DataManage from '@/components/dataManage/DataManage'

export const router_info={ //为了方便外界通过键值的方式 使用路由信息，
	'DataManage':{
		path:'/data',
      	name:'data',
      	component:DataManage
	}
}


function convert2Array(object){ //转换成Array
	let array=[]
	for(let i in object){
		array.push(object[i])
	}
	return array;
}

export  const router_meta= convert2Array(router_info)
