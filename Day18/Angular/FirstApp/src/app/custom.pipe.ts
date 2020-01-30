import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'custom'
})
export class CustomPipe implements PipeTransform {

  digit:number;
  power:number;

  transform(digit:number , power:number): number {
    
    return Math.pow(digit,power);
  }

  // transform(msg:string ): number {
    
  //     return msg.length;
  //   }

}
