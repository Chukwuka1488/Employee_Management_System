import {Observable} from 'rxjs';
import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";
import {Employee} from "./employee";

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  private apiServerUrl = '';

  constructor(private http: HttpClient) {
  }

  // get all employees
  public getEmployees(): Observable<Employee[]> {
    return this.http.get<Employee[]>(`${this.apiServerUrl}/employee/all`)
  }

  // get single employee
  public getEmployee(employeeId: string): Observable<Employee> {
    return this.http.get<Employee>(`${this.apiServerUrl}/employee/${employeeId}`)
  }

  // add an employee
  public addEmployee(employee: Employee): Observable<Employee> {
    return this.http.post<Employee>(`${this.apiServerUrl}/employee/add`, employee)
  }

  // update an employee
  public updateEmployee(employee: Employee): Observable<Employee> {
    return this.http.put<Employee>(`${this.apiServerUrl}/employee/update`, employee)
  }

  // delete an employee
  public deleteEmployee(employeeId: string): Observable<void> {
    return this.http.delete<void>(`${this.apiServerUrl}/employee/delete/${employeeId}`)
  }


}
