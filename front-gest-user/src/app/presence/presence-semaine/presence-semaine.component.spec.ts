import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PresenceSemaineComponent } from './presence-semaine.component';

describe('PresenceSemaineComponent', () => {
  let component: PresenceSemaineComponent;
  let fixture: ComponentFixture<PresenceSemaineComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PresenceSemaineComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PresenceSemaineComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
