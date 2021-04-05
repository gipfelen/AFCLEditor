package afcl.language.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConceptPresentationAspectBase;
import jetbrains.mps.smodel.runtime.ConceptPresentation;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.runtime.ConceptPresentationBuilder;

public class ConceptPresentationAspectImpl extends ConceptPresentationAspectBase {
  private ConceptPresentation props_BooleanLiteral;
  private ConceptPresentation props_BooleanType;
  private ConceptPresentation props_Data;
  private ConceptPresentation props_DataInput;
  private ConceptPresentation props_DataOutput;
  private ConceptPresentation props_DataReference;
  private ConceptPresentation props_Expression;
  private ConceptPresentation props_Function;
  private ConceptPresentation props_FunctionBlock;
  private ConceptPresentation props_FunctionType;
  private ConceptPresentation props_IDataScope;
  private ConceptPresentation props_IResultScope;
  private ConceptPresentation props_InputBlock;
  private ConceptPresentation props_Literal;
  private ConceptPresentation props_NumberLiteral;
  private ConceptPresentation props_NumberType;
  private ConceptPresentation props_OutputBlock;
  private ConceptPresentation props_ResultBlock;
  private ConceptPresentation props_ResultReference;
  private ConceptPresentation props_StringLiteral;
  private ConceptPresentation props_StringType;
  private ConceptPresentation props_Type;
  private ConceptPresentation props_Workflow;

  @Override
  @Nullable
  public ConceptPresentation getDescriptor(SAbstractConcept c) {
    StructureAspectDescriptor structureDescriptor = (StructureAspectDescriptor) myLanguageRuntime.getAspect(jetbrains.mps.smodel.runtime.StructureAspectDescriptor.class);
    switch (structureDescriptor.internalIndex(c)) {
      case LanguageConceptSwitch.BooleanLiteral:
        if (props_BooleanLiteral == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("BooleanLiteral");
          props_BooleanLiteral = cpb.create();
        }
        return props_BooleanLiteral;
      case LanguageConceptSwitch.BooleanType:
        if (props_BooleanType == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Boolean");
          props_BooleanType = cpb.create();
        }
        return props_BooleanType;
      case LanguageConceptSwitch.Data:
        if (props_Data == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          props_Data = cpb.create();
        }
        return props_Data;
      case LanguageConceptSwitch.DataInput:
        if (props_DataInput == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_DataInput = cpb.create();
        }
        return props_DataInput;
      case LanguageConceptSwitch.DataOutput:
        if (props_DataOutput == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_DataOutput = cpb.create();
        }
        return props_DataOutput;
      case LanguageConceptSwitch.DataReference:
        if (props_DataReference == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("DataReference");
          props_DataReference = cpb.create();
        }
        return props_DataReference;
      case LanguageConceptSwitch.Expression:
        if (props_Expression == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          props_Expression = cpb.create();
        }
        return props_Expression;
      case LanguageConceptSwitch.Function:
        if (props_Function == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_Function = cpb.create();
        }
        return props_Function;
      case LanguageConceptSwitch.FunctionBlock:
        if (props_FunctionBlock == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("FunctionBlock");
          props_FunctionBlock = cpb.create();
        }
        return props_FunctionBlock;
      case LanguageConceptSwitch.FunctionType:
        if (props_FunctionType == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_FunctionType = cpb.create();
        }
        return props_FunctionType;
      case LanguageConceptSwitch.IDataScope:
        if (props_IDataScope == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          props_IDataScope = cpb.create();
        }
        return props_IDataScope;
      case LanguageConceptSwitch.IResultScope:
        if (props_IResultScope == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          props_IResultScope = cpb.create();
        }
        return props_IResultScope;
      case LanguageConceptSwitch.InputBlock:
        if (props_InputBlock == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("InputBlock");
          props_InputBlock = cpb.create();
        }
        return props_InputBlock;
      case LanguageConceptSwitch.Literal:
        if (props_Literal == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          props_Literal = cpb.create();
        }
        return props_Literal;
      case LanguageConceptSwitch.NumberLiteral:
        if (props_NumberLiteral == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Number");
          props_NumberLiteral = cpb.create();
        }
        return props_NumberLiteral;
      case LanguageConceptSwitch.NumberType:
        if (props_NumberType == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Number");
          props_NumberType = cpb.create();
        }
        return props_NumberType;
      case LanguageConceptSwitch.OutputBlock:
        if (props_OutputBlock == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("OutputBlock");
          props_OutputBlock = cpb.create();
        }
        return props_OutputBlock;
      case LanguageConceptSwitch.ResultBlock:
        if (props_ResultBlock == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("ResultBlock");
          props_ResultBlock = cpb.create();
        }
        return props_ResultBlock;
      case LanguageConceptSwitch.ResultReference:
        if (props_ResultReference == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_ResultReference = cpb.create();
        }
        return props_ResultReference;
      case LanguageConceptSwitch.StringLiteral:
        if (props_StringLiteral == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("\"");
          props_StringLiteral = cpb.create();
        }
        return props_StringLiteral;
      case LanguageConceptSwitch.StringType:
        if (props_StringType == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("String");
          props_StringType = cpb.create();
        }
        return props_StringType;
      case LanguageConceptSwitch.Type:
        if (props_Type == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          props_Type = cpb.create();
        }
        return props_Type;
      case LanguageConceptSwitch.Workflow:
        if (props_Workflow == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_Workflow = cpb.create();
        }
        return props_Workflow;
    }
    return null;
  }
}
