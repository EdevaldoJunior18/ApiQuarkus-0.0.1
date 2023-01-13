package org.acme.models;

import javax.json.bind.annotation.JsonbProperty;

public class ConsultPartnersResponseCelcoinDto {

    public class ParceirosPecRec{
    
        @JsonbProperty("codeParceiro")
        private int codePartner;

        @JsonbProperty("IndBarCodeDeposit")
        private String indBarCodeDeposit;

        @JsonbProperty("IndBarCodeWithdraw")
        private String indBarCodeWithdraw;

        @JsonbProperty("IndQRCodeDeposit")
        private String indQRCodeDeposit;

        @JsonbProperty("IndQRCodeWithdraw")
        private String indQRCodeWithdraw;

        @JsonbProperty("namePartner")
        private String namePartner;

        @JsonbProperty("partnerPecRecRecId")
        private int partnerPecRecRecId;

        @JsonbProperty("partnerType")
        private String partnerType;

        @JsonbProperty("typeTransactionsCancelamento")
        private String typeTransactionCancel;

        @JsonbProperty("maxValueDeposito")
        private Double maxValueDeposit;

        @JsonbProperty("maxValueSaque")
        private Double maxValueWithdraw;

        @JsonbProperty("minValueDeposito")
        private Double minValueDeposit;

        @JsonbProperty("minValueSaque")
        private Double minValueWithdraw;

        public int getCodePartner() {
            return codePartner;
        }

        public void setCodePartner(int codePartner) {
            this.codePartner = codePartner;
        }

        public String getIndBarCodeDeposit() {
            return indBarCodeDeposit;
        }

        public void setIndBarCodeDeposit(String indBarCodeDeposit) {
            this.indBarCodeDeposit = indBarCodeDeposit;
        }

        public String getIndBarCodeWithdraw() {
            return indBarCodeWithdraw;
        }

        public void setIndBarCodeWithdraw(String indBarCodeWithdraw) {
            this.indBarCodeWithdraw = indBarCodeWithdraw;
        }

        public String getIndQRCodeDeposit() {
            return indQRCodeDeposit;
        }

        public void setIndQRCodeDeposit(String indQRCodeDeposit) {
            this.indQRCodeDeposit = indQRCodeDeposit;
        }

        public String getIndQRCodeWithdraw() {
            return indQRCodeWithdraw;
        }

        public void setIndQRCodeWithdraw(String indQRCodeWithdraw) {
            this.indQRCodeWithdraw = indQRCodeWithdraw;
        }

        public String getNamePartner() {
            return namePartner;
        }

        public void setNamePartner(String namePartner) {
            this.namePartner = namePartner;
        }

        public int getPartnerPecRecRecId() {
            return partnerPecRecRecId;
        }

        public void setPartnerPecRecRecId(int partnerPecRecRecId) {
            this.partnerPecRecRecId = partnerPecRecRecId;
        }

        public String getPartnerType() {
            return partnerType;
        }

        public void setPartnerType(String partnerType) {
            this.partnerType = partnerType;
        }

        public String getTypeTransactionCancel() {
            return typeTransactionCancel;
        }

        public void setTypeTransactionCancel(String typeTransactionCancel) {
            this.typeTransactionCancel = typeTransactionCancel;
        }

        public Double getMaxValueDeposit() {
            return maxValueDeposit;
        }

        public void setMaxValueDeposit(Double maxValueDeposit) {
            this.maxValueDeposit = maxValueDeposit;
        }

        public Double getMaxValueWithdraw() {
            return maxValueWithdraw;
        }

        public void setMaxValueWithdraw(Double maxValueWithdraw) {
            this.maxValueWithdraw = maxValueWithdraw;
        }

        public Double getMinValueDeposit() {
            return minValueDeposit;
        }

        public void setMinValueDeposit(Double minValueDeposit) {
            this.minValueDeposit = minValueDeposit;
        }

        public Double getMinValueWithdraw() {
            return minValueWithdraw;
        }

        public void setMinValueWithdraw(Double minValueWithdraw) {
            this.minValueWithdraw = minValueWithdraw;
        }

    }
    
    @JsonbProperty("errorCode")
    private int errorCode;

    @JsonbProperty("message")
    private String message;
        
    @JsonbProperty("status")
    private Double status;

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Double getStatus() {
        return status;
    }

    public void setStatus(Double status) {
        this.status = status;
    }
}