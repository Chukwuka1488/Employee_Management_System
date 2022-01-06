import {Component, OnInit} from '@angular/core';
import {Employee} from "./employee";
import {EmployeeService} from './employee.service';
import {HttpErrorResponse} from "@angular/common/http";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
// on init so that any time the app is loaded, we call all the employee data
export class AppComponent implements OnInit {
  title = 'employee-manager-app';

  // to hold all data coming from the database
  // public employees: Employee[] = [];

  // // inject employee service to this class of app component
  // constructor(private employeeService: EmployeeService) {
  // }

  ngOnInit() {
    // this.getEmployees();
  }

  // public getEmployees(): void {
  //   this.employeeService.getEmployees().subscribe(
  //     (response) => {
  //       this.employees = response;
  //     },
  //     (err: HttpErrorResponse) => {
  //       console.log(err.message);
  //       alert(err.message);
  //     }
  //   )
  // }
}
