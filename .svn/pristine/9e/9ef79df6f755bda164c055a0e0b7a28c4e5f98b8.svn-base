package org.loan.user.convertor;

import org.loan.core.common.enums.UserAuthTypeEnums;
import org.loan.core.domain.ClUserAuthEntity;
import org.loan.core.domain.ClUserAuthTypeEntity;
import org.loan.user.model.resp.AuthTypeResp;

/**
 * @author xlk
 * on 2018/7/20 0020.
 */
public class AuthTypeConvertor {
    public static AuthTypeResp entityToResp(ClUserAuthTypeEntity clUserAuthTypeEntity, ClUserAuthEntity clUserAuthEntity) {
        AuthTypeResp authTypeResp = new AuthTypeResp();
        String code = clUserAuthTypeEntity.getCode();
        authTypeResp.setCode(code);
        authTypeResp.setDescription(clUserAuthTypeEntity.getDescription());
        authTypeResp.setSort(clUserAuthTypeEntity.getSort());
        if (UserAuthTypeEnums.ID.getCode().equals(code)) {
            authTypeResp.setState(clUserAuthEntity.getIdState());
        }
        if (UserAuthTypeEnums.BASE_INFO.getCode().equals(code)) {

        }
        if (UserAuthTypeEnums.PHONE.getCode().equals(code)) {

        }
        if (UserAuthTypeEnums.CREDIT.getCode().equals(code)) {

        }
        if (UserAuthTypeEnums.PARK.getCode().equals(code)) {

        }
        if (UserAuthTypeEnums.SECURITY.getCode().equals(code)) {

        }
        if (UserAuthTypeEnums.ACCUMULATION.getCode().equals(code)) {

        }
        if (UserAuthTypeEnums.HOME.getCode().equals(code)) {

        }
        return authTypeResp;
    }
}
