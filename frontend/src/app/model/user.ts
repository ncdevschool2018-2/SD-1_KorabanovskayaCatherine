
export class User {
  userId: string;
  userLogin: string;
  userPassword: string;
  registrationDate: string;
  username: string;
  roleId: string;

  static cloneBase(user: User): User {
    let cloneUser: User = new User();
    cloneUser.userId = user.userId;
    cloneUser.userLogin = user.userLogin;
    cloneUser.userPassword = user.userPassword;
    cloneUser.registrationDate = user.registrationDate;
    cloneUser.username = user.username;
    cloneUser.roleId = user.roleId;
    return cloneUser;
  }
}
