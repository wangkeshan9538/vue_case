import {getUrlFunc} from './base'

const scheduleInfoGet_Info={mockId:189413,method:'GET',URL:"/Schedule"};

export const scheduleGetter = (param)=>{
  return getUrlFunc(scheduleInfoGet_Info ,param)
};

