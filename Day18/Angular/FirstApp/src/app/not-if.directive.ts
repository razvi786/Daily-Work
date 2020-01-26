import { Directive, ViewContainerRef, TemplateRef,Input } from '@angular/core';

@Directive({
  selector: '[appNotIf]'
})
export class NotIfDirective {

  constructor(private templateRef: TemplateRef<any>, private viewContainer: ViewContainerRef) { }

  @Input() set appNotIf(condition: boolean) {
    if (!condition) {
        this.viewContainer.createEmbeddedView(this.templateRef);
    } else {
        this.viewContainer.clear();        
    }
  }

}
