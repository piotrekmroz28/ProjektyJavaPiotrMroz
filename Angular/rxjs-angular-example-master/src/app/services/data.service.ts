import { Injectable } from '@angular/core';
import { DataBaseService, Person } from './data-base.service';
import { BehaviorSubject, Observer, PartialObserver, Subject } from 'rxjs';
import { threadId } from 'worker_threads';

@Injectable({
  providedIn: 'root',
})
export class DataService {

  behaviousSubject = new BehaviorSubject<Person[]>([]);
  subject = new Subject<Person[]>();

  constructor(private dataBaseService: DataBaseService) {
    this.init();
  }

  addPerson(person: Person){
    this.dataBaseService.addPerson(person).subscribe(this.observer());
  }

  private init(): void{
    this.dataBaseService.fetchPersons().subscribe(this.observer())
  }

  private observer(): Observer<Person[]> {
    return {
      next: (persons: Person[]) => {
        this.behaviousSubject.next(persons);
        this.subject.next(persons);
      },
      error: error => console.error(error),
      complete: () => console.log('Completed')
    }
  }
}
