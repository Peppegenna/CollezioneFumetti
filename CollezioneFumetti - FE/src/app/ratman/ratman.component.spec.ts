import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RatmanComponent } from './ratman.component';

describe('RatmanComponent', () => {
  let component: RatmanComponent;
  let fixture: ComponentFixture<RatmanComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RatmanComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RatmanComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
