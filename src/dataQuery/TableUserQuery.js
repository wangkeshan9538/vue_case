import axios from 'axios'
import _typeof from 'babel-runtime/helpers/typeof'
const ROOT_URL=process.env.ROOT_URL;
const NEED_MOCK=true;

function getMockUrlPromise(interfaceId, method) {
  if (method === 'GET'){
    let url=ROOT_URL.replace('interfaceId',interfaceId );
    return axios.get(url)
  }
}

function getRealUrlPromise(url,method,param){
  if (method === 'GET'){
    let url=ROOT_URL.append(url);
    return axios.get(url , { params:{...param } })  // 使用...相当于吧对象里的属性 用，分割， 但其实直接params:param 我觉得也可以
  }
}

function getUrlFunc(urlInfo ,param){
  if(NEED_MOCK){
    return getMockUrlPromise(urlInfo.mockId, urlInfo.method );
  }else{
    return getRealUrlPromise(URL,method , param);
  }
}

const UserGet_Info={mockId:187123,method:'GET',URL:""};

export const UserGetter = (param)=>{
  return getUrlFunc(UserGet_Info ,param)
}


