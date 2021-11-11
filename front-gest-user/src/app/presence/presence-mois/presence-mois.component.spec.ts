import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PresenceMoisComponent } from './presence-mois.component';

describe('PresenceMoisComponent', () => {
  let component: PresenceMoisComponent;
  let fixture: ComponentFixture<PresenceMoisComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PresenceMoisComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PresenceMoisComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
