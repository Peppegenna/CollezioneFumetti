import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { OnepieceComponent } from './onepiece.component';

describe('OnepieceComponent', () => {
  let component: OnepieceComponent;
  let fixture: ComponentFixture<OnepieceComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ OnepieceComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(OnepieceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
