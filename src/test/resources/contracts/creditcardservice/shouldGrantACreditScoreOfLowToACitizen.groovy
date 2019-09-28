package contracts.creditcardservice

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method 'POST'
        url '/credit-scores'
        body (
                "citizenNumber" : 4444,
                "requestedDate": $(consumer(anyDate()), producer("2019-09-29"))
        )
        headers {
            contentType applicationJson()
        }
    }
    response {
        status 200
        body(
                "score": "LOW",
                "uuid": $(consumer("66ce29f3-ae87-4097-94e8-60b3b10c3855"), producer(anyUuid()))
        )
        headers {
            contentType applicationJson()
        }
    }
}