import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PipesComponent } from './pipes.component';

// describe('PipesComponent', () => {
//   let component: PipesComponent;
//   let fixture: ComponentFixture<PipesComponent>;

//   beforeEach(async(() => {
//     TestBed.configureTestingModule({
//       declarations: [ PipesComponent ]
//     })
//     .compileComponents();
//   }));

//   beforeEach(() => {
//     fixture = TestBed.createComponent(PipesComponent);
//     component = fixture.componentInstance;
//     fixture.detectChanges();
//   });

// it('should create', () => {
//   expect(component).toBeTruthy();
// });

// });

function greetings() {
  return 'Good Morning!';
}

function add(a: number, b: number): number {
  return a + b;
}

function sub(a: number, b: number): number {
  return a - b;
}

function fact(n:number):number{
  if(n==1)
    return 1;
  return n*fact(n-1);
}

describe('Greeting Message', () => {
  let expected = '';
  let sum=0;
  let diff=0;
  let fact=0;



  beforeEach(() => {
    expected = 'Good Morning!';
    fact=120;
  });

  afterEach(() => {
    expected = '';
  });

  it('My GreetingMessage', () => {
    expect(greetings()).toEqual(expected);
  })

  it('Good Bye', () => {
    expect(greetings()).toEqual(expected);
  })

  fit('Sum', () => {
    expect(add(5, 3)).toEqual(8);
  })

  fit('Difference', () => {
    expect(sub(5, 3)).toEqual(2);
  })


})

