
export class Client {

  clientId: string;
  userId: string;
  clientLastName: string;
  clientFirstName: string;
  clientDateBirthday: string;

  static cloneBase(client: Client): Client {
    let cloneClient: Client = new Client();
    cloneClient.clientId = client.clientId;
    cloneClient.userId = client.userId;
    cloneClient.clientLastName = client.clientLastName;
    cloneClient.clientFirstName = client.clientFirstName;
    cloneClient.clientDateBirthday = client.clientDateBirthday;
    return cloneClient;
  }
}
