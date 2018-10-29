
export class Company {

  companyId: string;
  userId: string;
  companyName: string;
  companyDomainName: string;
  maxAmountAvailableSubs: string;

  static cloneBase(company: Company): Company {
    let cloneCompany: Company = new Company();
    cloneCompany.companyId = company.companyId;
    cloneCompany.userId = company.userId;
    cloneCompany.companyName = company.companyName;
    cloneCompany.companyDomainName = company.companyDomainName;
    cloneCompany.maxAmountAvailableSubs = company.maxAmountAvailableSubs;
    return cloneCompany;
  }

}
