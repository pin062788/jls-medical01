package com.medical.dao;

import com.medical.model.VChronic;
import com.medical.model.VChronicExample;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class VChronicDAOImpl extends SqlMapClientDaoSupport implements VChronicDAO {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table YLJZN.V_CHRONIC
     *
     * @ibatorgenerated Mon Oct 27 15:50:27 CST 2014
     */
    public VChronicDAOImpl() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table YLJZN.V_CHRONIC
     *
     * @ibatorgenerated Mon Oct 27 15:50:27 CST 2014
     */
    public int countByExample(VChronicExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("V_CHRONIC.ibatorgenerated_countByExample", example);
        return count;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table YLJZN.V_CHRONIC
     *
     * @ibatorgenerated Mon Oct 27 15:50:27 CST 2014
     */
    public int deleteByExample(VChronicExample example) {
        int rows = getSqlMapClientTemplate().delete("V_CHRONIC.ibatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table YLJZN.V_CHRONIC
     *
     * @ibatorgenerated Mon Oct 27 15:50:27 CST 2014
     */
    public void insert(VChronic record) {
        getSqlMapClientTemplate().insert("V_CHRONIC.ibatorgenerated_insert", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table YLJZN.V_CHRONIC
     *
     * @ibatorgenerated Mon Oct 27 15:50:27 CST 2014
     */
    public void insertSelective(VChronic record) {
        getSqlMapClientTemplate().insert("V_CHRONIC.ibatorgenerated_insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table YLJZN.V_CHRONIC
     *
     * @ibatorgenerated Mon Oct 27 15:50:27 CST 2014
     */
    @SuppressWarnings("unchecked")
    public List<VChronic> selectByExample(VChronicExample example) {
        List<VChronic> list = getSqlMapClientTemplate().queryForList("V_CHRONIC.ibatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table YLJZN.V_CHRONIC
     *
     * @ibatorgenerated Mon Oct 27 15:50:27 CST 2014
     */
    public int updateByExampleSelective(VChronic record, VChronicExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("V_CHRONIC.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table YLJZN.V_CHRONIC
     *
     * @ibatorgenerated Mon Oct 27 15:50:27 CST 2014
     */
    public int updateByExample(VChronic record, VChronicExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("V_CHRONIC.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table YLJZN.V_CHRONIC
     *
     * @ibatorgenerated Mon Oct 27 15:50:27 CST 2014
     */
    private static class UpdateByExampleParms extends VChronicExample {
        private Object record;

        public UpdateByExampleParms(Object record, VChronicExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}