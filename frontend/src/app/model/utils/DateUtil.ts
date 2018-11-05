

export class DateUtil {

  public static convertTime(date: Date): string {
    let datetime: string = date.toLocaleString();
    let index: number = datetime.indexOf(',');
    return datetime.substring(0, index);
  }

}
