import { Component, OnInit } from '@angular/core';
import { WordType } from 'src/app/data/models';
import { WordsService } from 'src/app/ervic/words.service';

@Component({
  selector: 'app-question',
  templateUrl: './question.component.html',
  styleUrls: ['./question.component.css']
})
export class QuestionComponent implements OnInit {

  word: WordType = null;

  constructor(private wordsService: WordsService) { }

  ngOnInit(): void {
    this.fetchWord();
  }

  addToNouns(word: WordType): void {
    this.wordsService.addNoun(word);
    this.fetchWord();
  }

  addToVerbs(word: WordType): void {
    this.wordsService.addVerbe(word);
    this.fetchWord();
  }

  check(): void {
    this.wordsService.check();
  }

  private fetchWord(): void{
    this.word = this.wordsService.getWords().shift();
  }

}
