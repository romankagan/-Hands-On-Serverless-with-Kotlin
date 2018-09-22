/*
 * This file is generated by jOOQ.
 */
package com.packt.serverless.kotlin.letspoll.models.generated.tables.records;


import com.packt.serverless.kotlin.letspoll.models.generated.tables.Poll;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {"http://www.jooq.org", "jOOQ version:3.11.2"},
    comments = "This class is generated by jOOQ")
@SuppressWarnings({"all", "unchecked", "rawtypes"}) public class PollRecord
    extends UpdatableRecordImpl<PollRecord>
    implements Record5<Integer, String, String, String, Integer> {

    private static final long serialVersionUID = 844657664;

    /**
     * Setter for <code>public.poll.a_poll_id</code>.
     */
    public void setAPollId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.poll.a_poll_id</code>.
     */
    public Integer getAPollId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.poll.poll_id</code>.
     */
    public void setPollId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.poll.poll_id</code>.
     */
    public String getPollId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.poll.poll_title</code>.
     */
    public void setPollTitle(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.poll.poll_title</code>.
     */
    public String getPollTitle() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.poll.poll_question</code>.
     */
    public void setPollQuestion(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.poll.poll_question</code>.
     */
    public String getPollQuestion() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.poll.created_by</code>.
     */
    public void setCreatedBy(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.poll.created_by</code>.
     */
    public Integer getCreatedBy() {
        return (Integer) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override public Row5<Integer, String, String, String, Integer> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override public Row5<Integer, String, String, String, Integer> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override public Field<Integer> field1() {
        return Poll.POLL.A_POLL_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override public Field<String> field2() {
        return Poll.POLL.POLL_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override public Field<String> field3() {
        return Poll.POLL.POLL_TITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override public Field<String> field4() {
        return Poll.POLL.POLL_QUESTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override public Field<Integer> field5() {
        return Poll.POLL.CREATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override public Integer component1() {
        return getAPollId();
    }

    /**
     * {@inheritDoc}
     */
    @Override public String component2() {
        return getPollId();
    }

    /**
     * {@inheritDoc}
     */
    @Override public String component3() {
        return getPollTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override public String component4() {
        return getPollQuestion();
    }

    /**
     * {@inheritDoc}
     */
    @Override public Integer component5() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override public Integer value1() {
        return getAPollId();
    }

    /**
     * {@inheritDoc}
     */
    @Override public String value2() {
        return getPollId();
    }

    /**
     * {@inheritDoc}
     */
    @Override public String value3() {
        return getPollTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override public String value4() {
        return getPollQuestion();
    }

    /**
     * {@inheritDoc}
     */
    @Override public Integer value5() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override public PollRecord value1(Integer value) {
        setAPollId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override public PollRecord value2(String value) {
        setPollId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override public PollRecord value3(String value) {
        setPollTitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override public PollRecord value4(String value) {
        setPollQuestion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override public PollRecord value5(Integer value) {
        setCreatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override public PollRecord values(Integer value1, String value2, String value3, String value4,
        Integer value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PollRecord
     */
    public PollRecord() {
        super(Poll.POLL);
    }

    /**
     * Create a detached, initialised PollRecord
     */
    public PollRecord(Integer aPollId, String pollId, String pollTitle, String pollQuestion,
        Integer createdBy) {
        super(Poll.POLL);

        set(0, aPollId);
        set(1, pollId);
        set(2, pollTitle);
        set(3, pollQuestion);
        set(4, createdBy);
    }
}
