package request.parsing;

import messengers.Messenger;
import request.ErrorMessengerRequesterAbstract;
import request.Requester;

public class ParserStringToDouble extends ErrorMessengerRequesterAbstract<String, Double> {

    public ParserStringToDouble(Requester<String> requester, Messenger errorMessenger) {
        super(requester, errorMessenger);
    }

    @Override
    public Double request() {
        try {
            return Double.parseDouble(requester.request());
        } catch (NumberFormatException e) {
            errorMessenger.send();
            return this.request();
        }
    }
}
