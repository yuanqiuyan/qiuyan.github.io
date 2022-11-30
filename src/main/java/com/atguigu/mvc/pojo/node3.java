package com.atguigu.mvc.pojo;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor // 一定要有无参构造方法
public class node3 {
    @ExcelProperty(value = "序列号")
    private String sSerialNum;

    @ExcelProperty(value = "节点ID")
    private String sensorId;

    @ExcelProperty(value = "节点IP")
    private String sensorAddr;

    @ExcelProperty(value = "PORT")
    private String sensorPort;

    @ExcelProperty(value = "节点状态")
    private String sensorStatus;

    @ExcelProperty(value = "节点名称")
    private String sensorName;

    @ExcelProperty(value = "类型码")
    private String typeCode;

    @ExcelProperty(value = "备注")
    private String sensorRemark;

    public String getsSerialNum() {
        return sSerialNum;
    }

    public void setsSerialNum(String sSerialNum) {
        this.sSerialNum = sSerialNum == null ? null : sSerialNum.trim();
    }

    public String getSensorId() {
        return sensorId;
    }

    public void setSensorId(String sensorId) {
        this.sensorId = sensorId == null ? null : sensorId.trim();
    }

    public String getSensorAddr() {
        return sensorAddr;
    }

    public void setSensorAddr(String sensorAddr) {
        this.sensorAddr = sensorAddr == null ? null : sensorAddr.trim();
    }

    public String getSensorPort() {
        return sensorPort;
    }

    public void setSensorPort(String sensorPort) {
        this.sensorPort = sensorPort == null ? null : sensorPort.trim();
    }

    public String getSensorStatus() {
        return sensorStatus;
    }

    public void setSensorStatus(String sensorStatus) {
        this.sensorStatus = sensorStatus == null ? null : sensorStatus.trim();
    }

    public String getSensorName() {
        return sensorName;
    }

    public void setSensorName(String sensorName) {
        this.sensorName = sensorName == null ? null : sensorName.trim();
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode == null ? null : typeCode.trim();
    }

    public String getSensorRemark() {
        return sensorRemark;
    }

    public void setSensorRemark(String sensorRemark) {
        this.sensorRemark = sensorRemark == null ? null : sensorRemark.trim();
    }
}