import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Employee } from 'src/app/employee';
import { EmployeeService } from 'src/app/employee.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

 // to hold all data coming from the database
  public employees: Employee[] = [];

  // inject employee service to this class of app component
  constructor(private employeeService: EmployeeService) {
  }

  ngOnInit() {
    this.getEmployees();
  }

  public getEmployees(): void {
    this.employeeService.getEmployees().subscribe(
      (response) => {
        this.employees = response;
      },
      (err: HttpErrorResponse) => {
        console.log(err.message);
        alert(err.message);
      }
    )
  }
}
