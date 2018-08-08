import {getUrlFunc} from './base'

const UserGet_Info={mockId:187123,method:'GET',URL:"/user"};

export const UserGetter = (param)=>{
  return getUrlFunc(UserGet_Info ,param)
}


