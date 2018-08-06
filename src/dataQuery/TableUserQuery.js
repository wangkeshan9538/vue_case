import axios from 'axios'
import _typeof from 'babel-runtime/helpers/typeof'
var ROOT_URL=process.env.ROOT_URL;

function getAPPUrl(interfaceId, method) {
  if (method == 'GET'){
    console.log(process.env);
    var url=ROOT_URL.replace('interfaceId',interfaceId );
    return axios.get(url)
  }
}

export var UserGetter=getAPPUrl('187123','GET');
