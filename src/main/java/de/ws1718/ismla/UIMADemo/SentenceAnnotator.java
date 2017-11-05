package de.ws1718.ismla.UIMADemo;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceInitializationException;

import de.ws1718.ismla.UIMADemo.types.Sentence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.uima.UimaContext;
import opennlp.tools.*;
import opennlp.tools.sentdetect.SentenceDetectorME;
import opennlp.tools.sentdetect.SentenceModel;
import opennlp.tools.util.Span;

public class SentenceAnnotator extends JCasAnnotator_ImplBase {

	final private String NLPMODEL = "openNLPModel";
	InputStream input;
	SentenceModel model;
	SentenceDetectorME det;
	
			
	@Override
	public void initialize(UimaContext aContext) throws ResourceInitializationException{
		super.initialize(aContext);
		
		try{
				
			String path = new File((String) aContext.getConfigParameterValue(NLPMODEL)).getAbsolutePath();
			
			input = new FileInputStream(path);
			
			model = new SentenceModel(input);
			
			det = new SentenceDetectorME(model);
			
		} catch (FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e){
			e.printStackTrace();
		}
	
	}
	
	@Override
	public void process(JCas arg0) throws AnalysisEngineProcessException {
		// TODO Auto-generated method stub
		
		String doc = arg0.getDocumentText();
		Span sentences[] = det.sentPosDetect(doc);
		
		for(Span span : sentences){
			Sentence sent = new Sentence(arg0);
			sent.setBegin(span.getStart());
			sent.setEnd(span.getEnd());
			sent.addToIndexes(arg0);
				
		}
			

	}

}
