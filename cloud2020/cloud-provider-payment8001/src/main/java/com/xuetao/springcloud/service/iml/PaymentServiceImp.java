package com.xuetao.springcloud.service.iml;

import com.xuetao.springcloud.dao.PaymentDao;
import com.xuetao.springcloud.entities.Payment;
import com.xuetao.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName PaymentServiceImp
 * @Description TODO
 * @Author LiTao
 * @DaTe 2020/11/9 19:51
 * @Version 1.0
 **/
@Service
public class PaymentServiceImp implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
