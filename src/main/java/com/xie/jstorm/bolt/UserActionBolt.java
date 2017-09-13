package com.xie.jstorm.bolt;

import java.util.Map;

import backtype.storm.task.TopologyContext;
import backtype.storm.topology.BasicOutputCollector;
import backtype.storm.topology.IBasicBolt;
import backtype.storm.topology.OutputFieldsDeclarer;
import backtype.storm.tuple.Tuple;

public class UserActionBolt implements IBasicBolt {

	public void execute(Tuple input, BasicOutputCollector collector) {
		String word = input.getString(0);
		System.out.println("the word is "+word);
	}
	public void declareOutputFields(OutputFieldsDeclarer declarer) {
		// TODO Auto-generated method stub
		
	}

	public Map<String, Object> getComponentConfiguration() {
		// TODO Auto-generated method stub
		return null;
	}

	public void prepare(Map stormConf, TopologyContext context) {
		// TODO Auto-generated method stub
		
	}


	public void cleanup() {
		// TODO Auto-generated method stub
		
	}

}
