import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PresenceJourComponent } from './presence-jour.component';

describe('PresenceJourComponent', () => {
  let component: PresenceJourComponent;
  let fixture: ComponentFixture<PresenceJourComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PresenceJourComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PresenceJourComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
